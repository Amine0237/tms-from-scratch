package com.workshop.tms_fs_withoutjwt.service.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserAppDTO {
    private Long id;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
