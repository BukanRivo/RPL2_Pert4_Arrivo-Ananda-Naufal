/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pert4_nama.controllers;

import com.pert4_nama.models.MahasiswaModel;
import java.util.List;

/**
 *
 * @author axioo
 */
public interface MahasiswaController {
    public void addMahasiswa(MahasiswaModel mhsModel);
    public MahasiswaModel getMahasiswaById(int id);
    public List<MahasiswaModel> getAllMahasiswa();
    public void updateMahasiswa(MahasiswaModel mhsModel);
    public void deleteMahasiswa(int id); 
}
