package com.example.task.user.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetais {
	
	private String error;
	private String message;
	private LocalDateTime timestamp;

}
