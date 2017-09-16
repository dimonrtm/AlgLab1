package com.company;

/**
 * Created by админъ on 16.09.2017.
 */
public class BaseEntity {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "BaseEntity{"+"id="+id+"}";
    }

    public boolean isNew()
    {
        return (this.id==0);
    }
}
