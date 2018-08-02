package com.wyat.util;
import java.util.*;
import javax.mail.*;  
import javax.mail.internet.*;

import org.springframework.stereotype.Component;

/**
 * 
 * @author sai
 *
 */
@Component
public class MessageBody {

	public static String messageBody(String userName){

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title>Registration Confirmation</title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i>Hi"+"  "+userName+","+"</i>");
		sb.append("<br><br>");
		sb.append("<i> You have successfully logged into @Work...</i>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i> Where you @Work Application.</i></font>");
		
		return sb.toString();

	}


	public static String questionMsgBody(String userName, String question,String description){

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title></title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i>Hi"+"  "+userName+","+"</i>");
		sb.append("<br><br>");

		sb.append("<i> We have new question in Nisum Portal</i>");
		sb.append("<br>");
		sb.append("<b> Question :  </b><i>"+question+"..."+"</i>");
		sb.append("<a href='http://localhost:8080/portal/#/questions'>");
		sb.append("<i>for more details.</i>");
		sb.append("</a>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Please check this in Nisum portal. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i>Nisum Portal Application.</i></font>");
		return  sb.toString();

	}


	public static String ReplayToQuestionBody(String userName,String description,String questionId){

		String url="http://localhost:8080/portal/#/question/"+questionId;
		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title></title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i>Hi"+"  "+userName+","+"</i>");
		sb.append("<br><br>");

		sb.append("<i> Please find the answer in Nisum Portal</i>");
		sb.append("<br>");
		sb.append("<a href='"+url+"'>");
		sb.append("<i> Click for more details.</i>");
		sb.append("</a>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Please check this in Nisum portal. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i>Nisum Portal Application.</i></font>");
		return  sb.toString();

	}

	public static String trainingReqestBody(String topic,String id,String description){

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title></title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i><b>Hi ,</b></i>");
		sb.append("<br><br>");
		sb.append("<i> I am "+id+", Looking for training on "+"<b><font color=red>"+topic+"</font></b></i>");
		sb.append("<br><br>");
		sb.append("<i>Description :</i>");
		sb.append("<br><br>");
		sb.append("<i>"+description+"</i>");
		sb.append("<br><br>");
		sb.append("<i>Please do Needful and If There is a plan to arrange training on this, "+topic+" Please Let me Know</i>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Please check this in Nisum portal. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i>Nisum Portal Application.</i></font>");
		
		return sb.toString();

	}
	public static String removeLastChar(String str) {
		return str.substring(0,str.length()-1);
	}
	
	public static String trainingApproveMessageBody(String userName,String mailBody){

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title></title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i>Hi"+"  "+userName+","+"</i>");
		sb.append("<br><br>");
		sb.append("<i>"+mailBody+" </i>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i>Nisum Portal Application.</i></font>");
		
		return sb.toString();

	}


}  

