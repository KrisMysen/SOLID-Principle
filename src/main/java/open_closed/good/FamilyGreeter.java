package open_closed.good;

import java.util.List;

// Composite pattern
public class FamilyGreeter implements ContactPerson{

    private final List<ContactPerson> _familyMembers;

    public FamilyGreeter(List<ContactPerson> personalities) {
        // null check
        _familyMembers = personalities;
    }

    @Override
    public String getSalutation() {
        StringBuilder salutation = new StringBuilder();
        for (ContactPerson personality : _familyMembers) {
            salutation.append(personality.getSalutation()).append("\n");
        }
        return salutation.toString();
    }
}
