/**
 * Created by theXuser on 22/11/2016.
 */

package com.geekdos.tps.TP1.Exercice1;

public class PathName {
    private String name, dirName;
    private String separator = FileSystemTokenizer.getInstance().getSeparator();
    private PathName directory;

    public PathName(PathName directory, String path){
        this.name = path;
        this.directory = directory;
    }

    public PathName(String path){
        int pose = path.lastIndexOf(this.separator);
        if (pose == -1){
            new PathName(null, path);
        }else {
            this.name = path.substring(pose + 1, path.length());
            this.dirName = path.substring(0, pose);
            this.directory = new PathName(this.dirName);
            this.setPathNameAndTheDirectory(directory, name);
        }
    }

    public void setPathNameAndTheDirectory(PathName directory, String path){
        this.name = path;
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public PathName getDirectory() {
        return directory;
    }

    public void setDirectory(PathName directory) {
        this.directory = directory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return dirName+""+ separator +""+name;
    }
}
