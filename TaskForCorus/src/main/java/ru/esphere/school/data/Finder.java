package ru.esphere.school.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */

    public Set<String> findOldMembers(Collection<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();

        groups.stream().forEach(r -> r.getMembers().stream().filter(x -> x.getAge()>targetAge).forEach(
                x -> groupsNames.add(x.getName())));
        System.out.println(groupsNames); //для наглядости
        return groupsNames;
    }


}
