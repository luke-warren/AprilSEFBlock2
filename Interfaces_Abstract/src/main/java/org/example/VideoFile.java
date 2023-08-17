package org.example;

public class VideoFile extends File implements Playable{

    private String transcript;

    public VideoFile(int memory, String name, String transcript){
        super(memory, name);
        this.transcript = transcript;
    }

    @Override
    public void read(){
        System.out.println(this.transcript);
    }

    @Override
    public boolean save() {
        //Saving code
        System.out.println("The video file was saved");
        return true;
    }

    @Override
    public boolean saveAs(String fileName) {
        //Saving code for fileName
        System.out.println("The video file " + fileName + " was saved");
        return true;
    }

    @Override
    public void play(){
        System.out.println("Video is playing");
    }

}
