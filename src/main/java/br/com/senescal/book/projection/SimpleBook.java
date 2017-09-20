package br.com.senescal.book.projection;

public interface SimpleBook{

    Integer getId();
    String  getName();
    SimpleWriter getWriter();

    interface SimpleWriter {
        String getName();
    }

}
