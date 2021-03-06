/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program :
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Customer extends ServicePrice implements CustomerInvoice {
    private String name, email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        Date date = new Date();
        Locale lokal = Locale.forLanguageTag("id");
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);
        return formatter.format(date);
    }
}
