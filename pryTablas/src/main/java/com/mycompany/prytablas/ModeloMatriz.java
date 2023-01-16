package com.mycompany.prytablas;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author "el profe Ariel"
 * Creamos un modelo de tablas con los datos almacenados
 * directamente en una matríz
 */
public class ModeloMatriz extends AbstractTableModel {
    
    private int[][] matriz;  
    private int filas=0;
    private int columnas=0;

    public ModeloMatriz(int n) {
        this.filas=n;
        this.columnas=n;
        matriz=new int [filas][columnas];        
    }
        
    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return columnas;
    }

@Override
    public Object getValueAt(int fila, int columna) {
        return matriz[fila][columna];
    }
    
    @Override
    public String getColumnName(int col) {
        return null;
    }

@Override
    public Class getColumnClass(int columna) {        
        return Integer.class;
    }
    
     @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }    
    
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        matriz[fila][columna]=(int) value;
        fireTableCellUpdated(fila, columna);
    }   

    public void cargarMatriz(){
        CuadradoMagico c=new CuadradoMagico(filas); 
        c.generar();
        matriz=c.getMatriz();
        this.fireTableDataChanged();        
    }
}
