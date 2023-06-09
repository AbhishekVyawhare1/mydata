package com.lcwd.user.service.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	//Extra property that you want to manage
	
		public ResourceNotFoundException() {
			super("resource Not Found on server!!");
		}

		public ResourceNotFoundException(String message) {
			super(message);
		}
}
