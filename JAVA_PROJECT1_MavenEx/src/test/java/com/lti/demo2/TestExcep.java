package com.lti.demo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestExcep {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testUsernameIsNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			User user = new User();
			user.setName("Jay");
		});
		Assertions.assertEquals("Username cannot be blank", exception.getMessage());
	}

}
