package com.example.task.user.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String fullName;
	private String email;
	private String mobile;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	private String role="ROLE_CUSTOMER";

	//private List<Long> completedTasks;

}
