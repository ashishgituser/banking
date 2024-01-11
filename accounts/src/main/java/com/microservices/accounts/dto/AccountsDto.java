package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Account", description = "Schema to hold Account information")
public class AccountsDto {

    @Schema(description = "Account Number of Eazy Bank account", example = "3454433243")
    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "$|[\\d]{10}", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type of Eazy Bank account", example = "Savings")
    @NotEmpty(message = "Account type can not be null or empty")
    private String accountType;

    @Schema(description = "Eazy Bank branch address", example = "123 NewYork")
    @NotEmpty(message = "Branch address can not be null or empty")
    private String branchAddress;
}