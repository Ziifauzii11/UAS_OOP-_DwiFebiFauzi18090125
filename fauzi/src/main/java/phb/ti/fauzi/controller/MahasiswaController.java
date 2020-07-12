package phb.ti.fauzi.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phb.ti.fauzi.model.Mahasiswa;
import phb.ti.fauzi.repository.MahasiswaRepository;
/**
 *
 * @author Dwi Fauzi
 */
@Controller
public class MahasiswaController {
 @Autowired
 private MahasiswaRepository repo;

 @RequestMapping("/")
 public String createHome(Model model) {  
  model.addAttribute("mahasiswa", repo.findAll());
  return "index";
 }
 
 @RequestMapping(value="/tambah", method=RequestMethod.GET)
 public String tambah(Model model) {
  model.addAttribute("mahasiswa", new Mahasiswa());
  return "tambahData";
 }
 
 @RequestMapping(value="/tambah", method=RequestMethod.POST)
 public String tambah2(Model model, Mahasiswa mahasiswa) {
  model.addAttribute("mahasiswa", repo.save(mahasiswa));
  return "redirect:/";
 }
 
 @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
 public String edit(@PathVariable Integer id, Model model) {
  model.addAttribute("mahasiswa", repo.getOne(id));
  return "ubahData";
 }
 
 @RequestMapping(value="/hapus/{id}", method=RequestMethod.GET)
 public String hapus(@PathVariable Integer id) {
  repo.deleteById(id);
  return "redirect:/";
 }
}
