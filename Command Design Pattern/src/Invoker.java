public class Invoker {
	private Aggregator agg;
	private CMDInterface cmd;

	public Invoker(CMDInterface cmd) {
		this.cmd = cmd;
	}

	public void process(CMDInterface cmd) {
		cmd.execute();
	}
}
