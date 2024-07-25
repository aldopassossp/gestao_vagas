package br.com.aldopassos.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity(name = "company")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços!")
    private String userName;
    @Email(message = "O campo [email] deve conter um e-mail Valido")
    private String email;
    @Length(min=3, max=100, message = "A senha deve conter entre (3) e (10) caracteres")
    private String password;
    private String website;
    private String name;
    private String description;
    @CreationTimestamp
    private LocalDateTime createdAt;

}
