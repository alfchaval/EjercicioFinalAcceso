package com.example.usuario.notengotiempo.repository;

import com.example.usuario.notengotiempo.pojo.Tarea;

import java.util.ArrayList;
import java.util.Collections;

public class TareasRepository {

    private ArrayList<Tarea> tareas;
    private static TareasRepository tareasRepository;

    static {
        tareasRepository = new TareasRepository();
    }

    public TareasRepository() {
        this.tareas = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        addTarea(new Tarea("Tarea 1", "descripcion"));
        addTarea(new Tarea("Tarea 2", "descripcion"));
        addTarea(new Tarea("Tarea 3", "descripcion"));
        addTarea(new Tarea("Tarea 4", "descripcion"));
        addTarea(new Tarea("Tarea 5", "descripcion"));
    }

    public static TareasRepository getInstance() {
        if(tareasRepository == null) {
            tareasRepository = new TareasRepository();
        }
        return tareasRepository;
    }

    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public ArrayList<Tarea> getTareas() {
        Collections.sort(tareas);
        return tareas;
    }

    public boolean nameExist(String name) {
        boolean result = false;
        int index = 0;

        while (!result && index < tareas.size()) {
            if (name.equals(tareas.get(index).getNombre())) {
                result = true;
            } else {
                index++;
            }
        }
        return result;
    }

    public boolean validateDependency(String name, String shortname) {
        return nameExist(name);
    }

    public void editDependency(Tarea tarea) {
        boolean found = false;
        int index = 0;

        while (!found && index < tareas.size()) {
            if (tarea.getNombre() == tareas.get(index).getNombre()) {
                tareas.get(index).setDescripcion(tarea.getDescripcion());
                tareas.get(index).setEnlace(tarea.getEnlace());
                tareas.get(index).setFecha(tarea.getFecha());
                tareas.get(index).setImagen(tarea.getImagen());
                tareas.get(index).setImportancia(tarea.getImportancia());
                found = true;
            } else {
                index++;
            }
        }
    }

    public void deleteDependency(Tarea tarea) {
        boolean found = false;
        int index = 0;

        while (!found && index < tareas.size()) {
            if (tarea.getNombre() == tareas.get(index).getNombre()) {
                tareas.remove(index);
                found = true;
            } else
                index++;
        }
    }
}