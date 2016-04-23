package uwtacoma.apps.teachingandlearningcenter.domain;

import java.util.List;

/**
 * Created by Rahul on 4/18/2016.
 */
public class Tutor extends Staff {

    public List<String> subjectsCanTeach;
    public List<Subject> coursesTaken; // ???
    public String profilePicturePath;
    public String bio;

}
