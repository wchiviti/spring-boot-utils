package io.github.hobbstech.springbootutils.commons.validations;

public interface CommandValidator<T> {

    void validate(T t);

}
