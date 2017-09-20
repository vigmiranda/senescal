package br.com.senescal.book.exception;

import br.com.senescal.core.validator.WithArguments;

import javax.persistence.EntityNotFoundException;

public class BookNotFoundException  extends EntityNotFoundException implements WithArguments {

    private final Object[] args;

    public BookNotFoundException() {
        super("book.not.found.exception");
        this.args = new Object[0];
    }

    public BookNotFoundException(Integer id) {
        super("book.not.found.exception");
        this.args = new Object[]{id};
    }

    @Override
    public Object[] getArgs() {
        return this.args;
    }
}
