package com.phi.soft.kafkastreamclientone.config;

import java.util.Objects;

public class Domain {


   public String domain;
  public   String create_date;
  public   String update_date;
  public   String country;
  public   boolean isDead;
  public   String A;
  public   String NS;
  public   String CNAME;
  public   String MX;
  public   String TXT;

    public Domain() {

    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public String getMX() {
        return MX;
    }

    public void setMX(String MX) {
        this.MX = MX;
    }

    public String getTXT() {
        return TXT;
    }

    public void setTXT(String TXT) {
        this.TXT = TXT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domain domain1 = (Domain) o;
        return isDead == domain1.isDead &&
                Objects.equals(domain, domain1.domain) &&
                Objects.equals(create_date, domain1.create_date) &&
                Objects.equals(update_date, domain1.update_date) &&
                Objects.equals(country, domain1.country) &&
                Objects.equals(A, domain1.A) &&
                Objects.equals(NS, domain1.NS) &&
                Objects.equals(CNAME, domain1.CNAME) &&
                Objects.equals(MX, domain1.MX) &&
                Objects.equals(TXT, domain1.TXT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, create_date, update_date, country, isDead, A, NS, CNAME, MX, TXT);
    }
}
