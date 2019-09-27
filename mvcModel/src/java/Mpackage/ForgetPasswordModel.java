/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mpackage;

import accountIssue.OtpGenerator;
import databaseConnection.DbConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import registerationService.UserService;
import utility.MailSender;
import utility.RecoveryMail;

/**
 *
 * @author nafees
 */
public class ForgetPasswordModel implements ModelInterface {

    public void requestProcessor(HttpServletRequest request, HttpServletResponse response, ServletContext ctx) {
        try {

            Connection connection = DbConn.getCon(ctx);
            String email = request.getParameter("email");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select email from login where(email='" + email + "');");
            PrintWriter out = response.getWriter();
            if (resultSet.next()) {
                UserService service = new UserService();
                service.setOtp(OtpGenerator.OTP(5));
                RecoveryMail mailSender = new RecoveryMail();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into mail_code values(?,?,?)");
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, null);
                preparedStatement.setString(3, service.getOtp());
                preparedStatement.execute();
                mailSender.sendMail(email, service.getOtp());
            } else {
                out.println("<html><h style='color:green;'>Available</h></html>");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
