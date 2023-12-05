package endterm;

public class SampleAccount extends Account{
	public String nickname;
	public int SubCount = 0;

	public SampleAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SampleAccount(String login, String password, String nickname) {
		super(login, password);
		this.nickname = nickname;
	}
	
	public void AddSubCount()
	{
		SubCount += 1;
	}
	
	public void AddSubCount(int newSubs)
	{
		SubCount += newSubs;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getSubCount() {
		return SubCount;
	}

	public void setSubCount(int subCount) {
		SubCount = subCount;
	}
	
	@Override
	public String toString(){
		return nickname + " " + login;
	}
}
