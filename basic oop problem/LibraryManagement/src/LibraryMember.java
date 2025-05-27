public class LibraryMember {
    private String memberName;
    private long memberId;
    private int memberAge;
    private String mobileNumber;
    private String emailAddress;

    public LibraryMember(String memberName, long memberId, int memberAge, String mobileNumber, String emailAddress) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberAge = memberAge;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    public LibraryMember(String memberName, long memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        memberAge = -1;
        mobileNumber = null;
        emailAddress = null;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
