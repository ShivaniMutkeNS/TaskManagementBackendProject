package com.example.task.submission.service.service;

import com.example.task.submission.service.dtos.TaskDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "SUBMISSION-SERVICE",url = "${submission.url}")
public interface TaskService {
   @GetMapping("/api/tasks/{id}")
   public TaskDto getTaskById(@PathVariable Long id,
                              @RequestHeader("Authorization") String jwt);

   @PutMapping("/api/tasks/{id}/complete")
   public TaskDto completeTask(@PathVariable Long id);
}
