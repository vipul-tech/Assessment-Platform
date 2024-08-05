package com.assessment.platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.assessment.platform.entities.User;
import com.assessment.platform.services.UserService;
import com.assessment.platform.utility.Constants.ActiveStatus;
import com.assessment.platform.utility.Constants.UserRole;

@SpringBootApplication
public class AssessmentPlatformApplication {

	private final Logger LOG = LoggerFactory.getLogger(AssessmentPlatformApplication.class);

	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(AssessmentPlatformApplication.class, args);
	}

	public void run(String... args) throws Exception {

		User admin = this.userService.getUserByEmailIdAndRoleAndStatus("admin@demo.com",
				UserRole.ROLE_ADMIN.value(), ActiveStatus.ACTIVE.value());

		if (admin == null) {

			LOG.info("Admin not found in system, so adding default admin");

			User user = new User();
			user.setEmailId("admin@demo.com");
			user.setPassword(passwordEncoder.encode("admin1234"));
			user.setRole(UserRole.ROLE_ADMIN.value());
			user.setStatus(ActiveStatus.ACTIVE.value());

			this.userService.addUser(user);

		}
	}
}
