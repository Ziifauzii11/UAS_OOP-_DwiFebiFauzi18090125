package phb.ti.fauzi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
/**
 *
 * @author Dwi Fauzi
 */
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
    @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Integer id;
 private Integer nim;
 private String nama;
 private String jurusan;
 private String alamat;
 @Version
 @Column(columnDefinition="")
 private Integer version;
 
 public Mahasiswa() {}
 public Mahasiswa(String nama, String jurusan, String alamat) {
  this.nim = nim;
  this.nama = nama;
  this.jurusan = jurusan;
  this.alamat = alamat;
 }
 public Integer getId() {
  return id;
 }
 public void setId(Integer id) {
  this.id = id;
 }
 public Integer getNim() {
  return nim;
 }
 public void setNim(Integer nim) {
  this.nim = nim;
 }
 public String getNama() {
  return nama;
 }
 public void setNama(String nama) {
  this.nama = nama;
 }
 public String getJurusan() {
  return jurusan;
 }
 public void setJurusan(String jurusan) {
  this.jurusan = jurusan;
 }
 public String getAlamat() {
  return alamat;
 }
 public void setAlamat(String alamat) {
  this.alamat = alamat;
 }
 public Integer getVersion() {
  return version;
 }
 public void setVersion(Integer version) {
  this.version = version;
 }
}
