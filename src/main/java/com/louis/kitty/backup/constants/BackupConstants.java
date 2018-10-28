package com.louis.kitty.backup.constants;

import java.io.File;

public interface BackupConstants {
	
	/** 备份目录 */
	String BACKUP_FOLDER = new File(BackupConstants.class.getClassLoader().getResource("").getPath()).getAbsolutePath() + File.separator + "_backup" + File.separator;
	/** 还原目录，默认就是备份目录 */
	String RESTORE_FOLDER = BACKUP_FOLDER;
	/** 日期格式 */
	String DATE_FORMAT = "yyyy-MM-dd_HHmmss";
	/** SQL拓展名 */
	String SQL_EXT = ".sql";
	/** 默认备份文件名 */
	String BACKUP_FILE_NAME = "kitty" + SQL_EXT;
	/** 初始化版本目录名称 */
	String DEFAULT_BACKUP_NAME = "backup";
	
}
