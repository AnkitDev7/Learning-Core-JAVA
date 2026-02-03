package Project.BankingManagementSystem.Utilation;

import Project.BankingManagementSystem.Exception.ValidationException;

@FunctionalInterface
public interface Validation <T>{
    void validate(T value) throws ValidationException;
}
