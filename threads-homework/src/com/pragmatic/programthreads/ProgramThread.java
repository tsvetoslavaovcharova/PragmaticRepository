package com.pragmatic.programthreads;

public class ProgramThread extends Thread {

    private String programName;

    public ProgramThread(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public void run() {
        System.out.println(this.programName);
    }
}
