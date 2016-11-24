package br.com.cotacao.schedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class UploadArquivoCsvSchedule extends QuartzJobBean {
	private RunUploadArquivoCsvSchedule runMeTask;

	public void setRunMeTask(RunUploadArquivoCsvSchedule runMeTask) {
		this.runMeTask = runMeTask;
	}

	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		runMeTask.printMe();

	}
}