package com.devsenior;

public class Sala {
    private Asiento[][] asientos;
    private final int FILAS = 10;
    private final int COLUMNAS = 6;

    public Sala(){
        asientos = new Asiento[FILAS][COLUMNAS];
        for(int i = 0; i < FILAS; i++){
            for(int j=0; j < COLUMNAS; j++){
                asientos[i][j] = new Asiento();
            }
        }
    }

    public EstadoAsiento[][] obtenerMapaEstado(){
        EstadoAsiento[][] mapa = new EstadoAsiento[FILAS][COLUMNAS];
        for(int i = 0; i < FILAS; i++){
            for(int j=0; j < COLUMNAS; j++){
               mapa[i][j] = asientos[i][j].getEstado();
            }
        }
        
        return mapa;
    }

    public void reservar(int fila, int col) throws AsientoOcupadoException, AsientoInvalidoException{
        validarIndices(fila, col);//si la posición pasada es válida o existente.
        if(!asientos[fila][col].estaLibre()){
            throw new AsientoOcupadoException("El asiento esta ocupado");
        }
        asientos[fila][col].setEstado(EstadoAsiento.OCUPADO);
    }

    public void cancelarReserva(int fila, int col) throws AsientoOcupadoException, AsientoInvalidoException{
         validarIndices(fila, col);//si la posición pasada es válida o existente.
         if(asientos[fila][col].estaLibre()){
            throw new AsientoOcupadoException("El asiento ya esta libre");
         }
         asientos[fila][col].setEstado(EstadoAsiento.LIBRE);
    }

    public int[] calcularEstadisticas(){
        int libres =0, ocupados = 0;
         for(int i = 0; i < FILAS; i++){
            for(int j=0; j < COLUMNAS; j++){
               if(asientos[i][j].estaLibre()) 
                  libres++;
               else 
                  ocupados++;
            }
        }
        return new int[]{libres, ocupados};
    }

    private void validarIndices(int fila, int col) throws AsientoInvalidoException{
        if(fila < 0 || fila >= FILAS || col < 0 || col >= COLUMNAS){
            throw new AsientoInvalidoException("Posicion fuera de rango fila: " + fila + " columna: " + col);
        }
    }

}
