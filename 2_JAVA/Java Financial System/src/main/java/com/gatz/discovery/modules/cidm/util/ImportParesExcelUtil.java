package com.gatz.discovery.modules.cidm.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ImportParesExcelUtil {
	/**
	 * 无参构造方法
	 */
	public ImportParesExcelUtil() {

	}

	/**
	 * 解析03版Excel，返回数据接口
	 * 
	 * @param in
	 *            输入流
	 * @param max
	 *            读取的列数
	 * @return excel中的数据
	 * @throws Exception
	 *             读取失败异常
	 */
	@SuppressWarnings("deprecation")
	public static Map<String, Map<Integer, List<String>>> readExcel03(InputStream in,
			int max) throws Exception {
		// 存放sheets数据的map
				Map<String,Map<Integer,List<String>>> bookMap = null;
try {
	
	

		// 存放rows数据的map
		Map<Integer, List<String>> sheetMap = null;

		// 存放cells数据的list
		List<String> rowList = null;

		// 生成HSSFWorkbook对象
		HSSFWorkbook workBook = null;

		// 捕获IO异常
		try {
			workBook = new HSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("读取Excel文件失败！");
		}

		// 获得sheet数量
		int sheetSize = workBook.getNumberOfSheets();

		// 存放sheet数据
		bookMap = new HashMap<String, Map<Integer, List<String>>>();

		// 遍历所有的sheet
		for (int i = 0; i < sheetSize; i++) {

			// 存放行数据
			sheetMap = new HashMap<Integer, List<String>>();

			// 获得第i个sheet
			HSSFSheet sheet = workBook.getSheetAt(i);
			
			String sheetName = sheet.getSheetName();

			// 如果sheet数量大小0
			if (sheet.getPhysicalNumberOfRows() > 0) {

				// 获得sheet中的行数
				int rows = sheet.getPhysicalNumberOfRows();
				
				//将空行数加上
				for(int k =0 ; k < rows;k++){
					HSSFRow row = sheet.getRow(k);
					if(row==null){
						rows++;
					}
				}

				// 判断是否存在行
				if (rows > 0) {

					// 遍历行
					for (int j = 1; j < rows; j++) {

						// 存放每一行的数据
						rowList = new ArrayList<String>();
						// 获得行
						HSSFRow row = sheet.getRow(j);

						// 判断行是否不为null
						if (row != null ) {

							// 遍历列
							for (int x = 0; x < max; x++) {

								// 获得列
								HSSFCell cell = row.getCell(x);

								// 用于存放值
								String value=null;

								// 判断列是否为null
								if (cell != null) {

									// 获得类型
									int cellType = cell.getCellType();

									// 判断是否是数值类型（数值类型分为：数字和日期）
									if (cellType == HSSFCell.CELL_TYPE_NUMERIC) {

										// 判断是否是日期
										if (HSSFDateUtil
												.isCellDateFormatted(cell)) {

											// 获得转换成本地的日期字符串
											value = cell.getDateCellValue()
													.toLocaleString();

										} else {
											// 获得转换成数字的字符串

											// 使用简单试转换
										  //value=String.valueOf(cell.getNumericCellValue());
										  BigDecimal numValue = new BigDecimal(cell.getNumericCellValue());
										  value=numValue.toString();
										}

										// 判断是否是字符
									} else if (cellType == HSSFCell.CELL_TYPE_STRING) {

										// 获得字符
										value = cell.getStringCellValue();
										if(value != null && value.indexOf("\\") != -1)
											value = value.replaceAll("\\\\", "\\\\\\\\");
										// 判断是否是布尔值
									} else if (cellType == HSSFCell.CELL_TYPE_BOOLEAN) {

										// 获得转换成字符的布尔值
										value = String.valueOf(cell
												.getBooleanCellValue());

										// 判断是否是空值
									} else if (cellType == HSSFCell.CELL_TYPE_BLANK) {

										// 直接赋空值
										value =null;

										// 判断是否是公式
									} else if (cellType == HSSFCell.CELL_TYPE_FORMULA) {

										// 获得公式计算的值
										value = String.valueOf(cell
												.getNumericCellValue());

										// 如果是NaN转换成字符
										if (value.equals("NaN")) {
											value = cell
													.getRichStringCellValue()
													.toString();
										}

										// 判断是否是故障
									} else if (cellType == HSSFCell.CELL_TYPE_ERROR) {

										// 直接赋空值
										value =null;

										// 其它的转换成字符
									} else {

										value = cell.getRichStringCellValue()
												.toString().trim();
									}

									// 如果cell为null,直接赋空值
								} else {
									value =null;

								}

								// 将列中的数据添加到list中
								rowList.add(value);

							}

						}else{
							//整行为空，跳到下一行
							continue;
						}

						// 将行中数据添加到map中
						sheetMap.put(j, rowList);

					}

				}
				//System.out.println(sheetMap);
				// 将sheet数据添加到map中
				bookMap.put(sheetName, sheetMap);

			}
		}
} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
	
		// 返回结果
		return bookMap;

	}

	
	public static void main(String[] arga){
		try{
			ImportParesExcelUtil.readExcel03(new FileInputStream("C:\\Users\\Admin\\Desktop\\2014年北京市各区县GDP数据.xls"), 14);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 解析07版Excel，返回数据接口
	 * 
	 * @param in
	 *            输入流
	 * @param max
	 *            读取的列数
	 * @return excel中的数据
	 * @throws Exception
	 *             读取失败异常
	 */
	@SuppressWarnings("deprecation")
	public static Map<String, Map<Integer, List<String>>> readExcel07(InputStream in,
			int max) throws Exception {

		// 存放sheets数据的map
		Map<String, Map<Integer, List<String>>> bookMap = null;

		// 存放rows数据的map
		Map<Integer, List<String>> sheetMap = null;

		// 存放cells数据的list
		List<String> rowList = null;

		// 生成HSSFWorkbook对象
		XSSFWorkbook workBook = null;

		// 捕获IO异常
		try {
			workBook = new XSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("读取Excel文件失败！");
		}

		// 获得sheet数量
		int sheetSize = workBook.getNumberOfSheets();

		// 存放sheet数据
		bookMap = new HashMap<String, Map<Integer, List<String>>>();

		// 遍历所有的sheet
		for (int i = 0; i < sheetSize; i++) {

			// 存放行数据
			sheetMap = new HashMap<Integer, List<String>>();

			// 获得第i个sheet
			XSSFSheet sheet = workBook.getSheetAt(i);
			String sheetName = sheet.getSheetName();

			// 如果sheet数量大小0
			if (sheet.getPhysicalNumberOfRows() > 0) {

				// 获得sheet中的行数
				int rows = sheet.getPhysicalNumberOfRows();
				
				//将空行数加上
				for(int k =0 ; k < rows;k++){
					XSSFRow row = sheet.getRow(k);
					if(row==null){
						rows++;
					}
				}

				// 判断是否存在行
				if (rows > 0) {

					// 遍历行
					for (int j = 1; j < rows; j++) {

						// 存放每一行的数据
						rowList = new ArrayList<String>();
						// 获得行
						XSSFRow row = sheet.getRow(j);
						
						// 判断行是否不为null
						if (row != null) {

							// 遍历列
							for (int x = 0; x < max; x++) {

								// 获得列
								XSSFCell cell = row.getCell(x);  

								// 用于存放值
								String value = null;

								// 判断列是否为null
								if (cell != null) {

									// 获得类型
									int cellType = cell.getCellType();

									// 判断是否是数值类型（数值类型分为：数字和日期）
									if (cellType == HSSFCell.CELL_TYPE_NUMERIC) {

										// 判断是否是日期
										if (HSSFDateUtil
												.isCellDateFormatted(cell)) {

											// 获得转换成本地的日期字符串
											value = cell.getDateCellValue()
													.toLocaleString();

										} else {
											// 获得转换成数字的字符串

											// 使用简单试转换
											value=String.valueOf(cell.getNumericCellValue());

										}

										// 判断是否是字符
									} else if (cellType == HSSFCell.CELL_TYPE_STRING) {

										// 获得字符
										value = cell.getStringCellValue();
										if(value != null && value.indexOf("\\") != -1)
											value = value.replaceAll("\\\\", "\\\\\\\\");
										// 判断是否是布尔值
									} else if (cellType == HSSFCell.CELL_TYPE_BOOLEAN) {

										// 获得转换成字符的布尔值
										value = String.valueOf(cell
												.getBooleanCellValue());

										// 判断是否是空值
									} else if (cellType == HSSFCell.CELL_TYPE_BLANK) {

										// 直接赋空值
										value = null;

										// 判断是否是公式
									} else if (cellType == HSSFCell.CELL_TYPE_FORMULA) {

										// 获得公式计算的值
										value = String.valueOf(cell
												.getNumericCellValue());

										// 如果是NaN转换成字符
										if (value.equals("NaN")) {
											value = cell
													.getRichStringCellValue()
													.toString();
										}

										// 判断是否是故障
									} else if (cellType == HSSFCell.CELL_TYPE_ERROR) {

										// 直接赋空值
										value = null;

										// 其它的转换成字符
									} else {

										value = cell.getRichStringCellValue()
												.toString().trim();
									}

									// 如果cell为null,直接赋空值
								} else {

									value = null;

								}

								
								// 将列中的数据添加到list中
								rowList.add(value);

							}

						}else{
							//整行为空，跳到下一行
							continue;
						}

						// 将行中数据添加到map中
						sheetMap.put(j, rowList);

					}

				}
				// 将sheet数据添加到map中
				bookMap.put(sheetName, sheetMap);

			}
		}
		// 返回结果
		
		return bookMap;

	}
}
