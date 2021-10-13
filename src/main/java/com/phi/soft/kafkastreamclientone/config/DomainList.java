package com.phi.soft.kafkastreamclientone.config;

import java.util.List;
import java.util.Objects;

public class DomainList {

    List<Domain>domainList;

    public DomainList(List<Domain> domainList) {
        this.domainList = domainList;
    }

    public DomainList() {
    }

    public List<Domain> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<Domain> domainList) {
        this.domainList = domainList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainList that = (DomainList) o;
        return Objects.equals(domainList, that.domainList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainList);
    }
}
