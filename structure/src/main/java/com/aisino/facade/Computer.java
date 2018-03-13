package com.aisino.facade;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startUp(){
        System.out.println("Computer started");
        this.cpu.startUp();
        this.memory.startUp();
        this.disk.startUp();
    }
    public void shutdown(){
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
        System.out.println("Computer shutdown");
    }
}
