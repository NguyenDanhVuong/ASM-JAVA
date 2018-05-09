/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author NDV_Luce
 */
public class sinhVien extends nguoi implements java.io.Serializable{
    String maSV;
    String lop;
    String email;

    public sinhVien(String maSV, String lop, String ho, String ten, String diaChi, String email) {
        super(ho, ten, diaChi);
        this.maSV = maSV;
        this.lop = lop;
        this.email = email;
    }


    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    public String getEmail() {       
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public Object[] toArray(){
        return new Object[]{maSV,ho,ten,diaChi,lop,email};
    }
    
}
