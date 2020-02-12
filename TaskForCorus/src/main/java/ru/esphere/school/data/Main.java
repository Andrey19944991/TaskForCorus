package ru.esphere.school.data;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(new Member("Nickolay", 10),new Member("Alexey",25),
                new Member("Andrey",30));
        List<Member> members1 = Arrays.asList(new Member("Evgenuy",40),new Member("Marat",20),
                new Member("Egor",50));
        List<Member> members2 = Arrays.asList(new Member("Vova",60),new Member("Ars",70),
                new Member("Serega",80));

        List<MembersGroup> groups = Arrays.asList(new MembersGroup("memberGroup1",members),
                new MembersGroup("memberGroup2",members1),
                new MembersGroup("memberGroup3",members2));

        new Finder().findOldMembers(groups,30);


    }
}
