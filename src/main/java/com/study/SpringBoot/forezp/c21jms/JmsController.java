package com.study.SpringBoot.forezp.c21jms;

import java.io.File;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("jms")
public class JmsController {

	@Autowired
	private JavaMailSenderImpl mailSender;

	/**
	 * 发送包含简单文本的邮件
	 */
	@RequestMapping("/txt")
	public @ResponseBody String sendTxtMail() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		// 设置收件人，寄件人
		simpleMailMessage.setTo(new String[] {"regan0524@163.com"});
		simpleMailMessage.setFrom("regan0524@163.com");
		simpleMailMessage.setSubject("Spring Boot Mail");
		simpleMailMessage.setText("这里是一段简单文本。");
		// 发送邮件
		mailSender.send(simpleMailMessage);

		System.out.println("邮件已发送");
		return "邮件已发送";
	}

	/**
	 * 发送包含HTML文本的邮件
	 * @throws Exception
	 */
	@RequestMapping("/html")
	public @ResponseBody String sendHtmlMail() throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setTo("regan0524@163.com");
		mimeMessageHelper.setFrom("regan0524@163.com");
		mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【HTML】");

		StringBuilder sb = new StringBuilder();
		sb.append("<html><head></head>");
		sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p></body>");
		sb.append("</html>");

		// 启用html
		mimeMessageHelper.setText(sb.toString(), true);
		// 发送邮件
		mailSender.send(mimeMessage);

		System.out.println("邮件已发送");
		return "邮件已发送";

	}

	/**
	 * 发送包含内嵌图片的邮件
	 * @throws Exception
	 */
	@RequestMapping("/attachedImage")
	public @ResponseBody String sendAttachedImageMail() throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		// multipart模式
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setTo("regan0524@163.com");
		mimeMessageHelper.setFrom("regan0524@163.com");
		mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【图片】");

		StringBuilder sb = new StringBuilder();
		sb.append("<html><head></head>");
		sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p>");
		// cid为固定写法，imageId指定一个标识
		sb.append("<img src=\"cid:imageId\"/></body>");
		sb.append("</html>");

		// 启用html
		mimeMessageHelper.setText(sb.toString(), true);

		// 设置imageId
		FileSystemResource img = new FileSystemResource(new File("D:/1.jpg"));
		mimeMessageHelper.addInline("imageId", img);

		// 发送邮件
		mailSender.send(mimeMessage);

		System.out.println("邮件已发送");
		return "邮件已发送";
	}

	/**
	 * 发送包含附件的邮件
	 * @throws Exception
	 */
	@RequestMapping("/attachedFile")
	public @ResponseBody String sendAttendedFileMail() throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		// multipart模式
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
		mimeMessageHelper.setTo("regan0524@163.com");
		mimeMessageHelper.setFrom("regan0524@163.com");
		mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【附件】");

		StringBuilder sb = new StringBuilder();
		sb.append("<html><head></head>");
		sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p></body>");
		sb.append("</html>");

		// 启用html
		mimeMessageHelper.setText(sb.toString(), true);
		// 设置附件
		FileSystemResource img = new FileSystemResource(new File("D:/1.jpg"));
		mimeMessageHelper.addAttachment("image.jpg", img);

		// 发送邮件
		mailSender.send(mimeMessage);

		System.out.println("邮件已发送");
		return "邮件已发送";
		
	}
}
