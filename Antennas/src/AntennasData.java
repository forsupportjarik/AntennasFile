import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class AntennasData {


    public static File createFile(String fileName) {
        File file = null;
        try {
            file = new File("C:\\DATA\\Mentor projects\\" + fileName);
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
        return file;
    }


    public static void writeDataToFile(File file) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mentor WHERE mentor.CellNameOSS NOT LIKE \"%null%\"");
        FileWriter fw = new FileWriter(file);
        fw.append("CELLID\tSITEID\tSITENAME\tLONGITUDE\tLATITUDE\tMCC\tMNC\tLAC\tCI\tANTDIR\tANTHEIGHT\tANTTILT\tANTELECTILT\tANTTYPE\tANTBW\tGROUNDHEIGHT\tCELLTYPE\tINFO1\tINFO2\tINFO3\tINFO4\tINFO5\tINFO6\tINFO7\tINFO8\tINFO9\tINFO10\tBSCRNC\tRNCID\tCID\tLOCALCELLID\tRAC\tARFCN\tBSIC\tSC\tTCHARFCN\tHOP\tHSN\tMAIO\tCPICHPOWER\tCELLSTATUS\tTECHBANDID\tCENTERFREQ\tPREAMBLEINDEX\tBANDWIDTH\tBASESTATIONID\tCHANNELNO\tPN\tTAC\tPCI\tENODEBID\tMAXPOWER\tRACHROOTSEQ\tBCCHPWR\tDLBANDWIDTH\tNEIGHID_1\tNEIGHID_2\tNEIGHID_3\tNEIGHID_4\tNEIGHID_5\tNEIGHID_6\tNEIGHID_7\tNEIGHID_8\tNEIGHID_9\tNEIGHID_10\tNEIGHID_11\tNEIGHID_12\tNEIGHID_13\tNEIGHID_14\tNEIGHID_15\tNEIGHID_16\tNEIGHID_17\tNEIGHID_18\tNEIGHID_19\tNEIGHID_20\tNEIGHID_21\tNEIGHID_22\tNEIGHID_23\tNEIGHID_24\tNEIGHID_25\tNEIGHID_26\tNEIGHID_27\tNEIGHID_28\tNEIGHID_29\tNEIGHID_30\tNEIGHID_31\tNEIGHID_32\tNEIGHID_33\tNEIGHID_34\tNEIGHID_35\tNEIGHID_36\tNEIGHID_37\tNEIGHID_38\tNEIGHID_39\tNEIGHID_40\tNEIGHID_41\tNEIGHID_42\tNEIGHID_43\tNEIGHID_44\tNEIGHID_45\tNEIGHID_46\tNEIGHID_47\tNEIGHID_48\tNEIGHID_49\tNEIGHID_50\tNEIGHID_51\tNEIGHID_52\tNEIGHID_53\tNEIGHID_54\tNEIGHID_55\tNEIGHID_56\tNEIGHID_57\tNEIGHID_58\tNEIGHID_59\tNEIGHID_60\tNEIGHID_61\tNEIGHID_62\tNEIGHID_63\tNEIGHID_64\tNEIGHID_65\tNEIGHID_66\tNEIGHID_67\tNEIGHID_68\tNEIGHID_69\tNEIGHID_70\tNEIGHID_71\tNEIGHID_72\tNEIGHID_73\tNEIGHID_74\tNEIGHID_75\tNEIGHID_76\tNEIGHID_77\tNEIGHID_78\tNEIGHID_79\tNEIGHID_80\tNEIGHID_81\tNEIGHID_82\tNEIGHID_83\tNEIGHID_84\tNEIGHID_85\tNEIGHID_86\tNEIGHID_87\tNEIGHID_88\tNEIGHID_89\tNEIGHID_90\tNEIGHID_91\tNEIGHID_92\tNEIGHID_93\tNEIGHID_94\tNEIGHID_95\tNEIGHID_96\tNEIGHID_97\tNEIGHID_98\tNEIGHID_99\tNEIGHID_100\tNEIGHID_101\tNEIGHID_102\tNEIGHID_103\tNEIGHID_104\tNEIGHID_105\tNEIGHID_106\tNEIGHID_107\tNEIGHID_108\tNEIGHID_109\tNEIGHID_110\tNEIGHID_111\tNEIGHID_112\tNEIGHID_113\tNEIGHID_114\tNEIGHID_115\tNEIGHID_116\tNEIGHID_117\tNEIGHID_118\tNEIGHID_119\tNEIGHID_120\tNEIGHID_121\tNEIGHID_122\tNEIGHID_123\tNEIGHID_124\tNEIGHID_125\tNEIGHID_126\tNEIGHID_127\tNEIGHID_128\tNEIGHID_127\tNEIGHID_128\tNEIGHID_129\tNEIGHID_130\tNEIGHID_131\tNEIGHID_132\tNEIGHID_133\tNEIGHID_134\tNEIGHID_135\tNEIGHID_136\tNEIGHID_137\tNEIGHID_138\tNEIGHID_139\tNEIGHID_140\tNEIGHID_141\tNEIGHID_142\tNEIGHID_143\tNEIGHID_144\tNEIGHID_145\tNEIGHID_146\tNEIGHID_147\tNEIGHID_148\tNEIGHID_149\tNEIGHID_150\tNEIGHID_151\tNEIGHID_152\tNEIGHID_153\tNEIGHID_154\tNEIGHID_155\tNEIGHID_156\tNEIGHID_157\tNEIGHID_158\tNEIGHID_159\tNEIGHID_160\tNEIGHID_161\tNEIGHID_162\tNEIGHID_163\tNEIGHID_164\tNEIGHID_165\tNEIGHID_166\tNEIGHID_167\tNEIGHID_168\tNEIGHID_169\tNEIGHID_170\tNEIGHID_171\tNEIGHID_172\tNEIGHID_173\tNEIGHID_174\tNEIGHID_175\tNEIGHID_176\tNEIGHID_177\tNEIGHID_178\tNEIGHID_179\tNEIGHID_180\tNEIGHID_181\tNEIGHID_182\tNEIGHID_183\tNEIGHID_184\tNEIGHID_185\tNEIGHID_186\tNEIGHID_187\tNEIGHID_188\tNEIGHID_189\tNEIGHID_190\tNEIGHID_191\tNEIGHID_192\tNEIGHID_193\tNEIGHID_194\tNEIGHID_195\tNEIGHID_196\tNEIGHID_197\tNEIGHID_198\tNEIGHID_199\tNEIGHID_200\tNEIGHID_201\tNEIGHID_202\tNEIGHID_203\tNEIGHID_204\tNEIGHID_205\tNEIGHID_206\tNEIGHID_207\tNEIGHID_208\tNEIGHID_209\tNEIGHID_210\tNEIGHID_211\tNEIGHID_212\tNEIGHID_213\tNEIGHID_214\tNEIGHID_215\tNEIGHID_216\tNEIGHID_217\tNEIGHID_218\tNEIGHID_219\tNEIGHID_220\tNEIGHID_221\tNEIGHID_222\tNEIGHID_223\tNEIGHID_224\tNEIGHID_225\tNEIGHID_226\tNEIGHID_227\tNEIGHID_228\tNEIGHID_229\tNEIGHID_230\tNEIGHID_231\tNEIGHID_232\tNEIGHID_233\tNEIGHID_234\tNEIGHID_235\tNEIGHID_236\tNEIGHID_237\tNEIGHID_238\tNEIGHID_239\tNEIGHID_240\tNEIGHID_241\tNEIGHID_242\tNEIGHID_243\tNEIGHID_244\tNEIGHID_245\tNEIGHID_246\tNEIGHID_247\tNEIGHID_248\tNEIGHID_249\tNEIGHID_250\tNEIGHID_251\tNEIGHID_252\tNEIGHID_253\tNEIGHID_254\tNEIGHID_255\tNEIGHID_256");
        while (rs.next()) {
            Antennas antennas = new Antennas(fw.append("UMTS" + "\t") + "",
                    fw.append("RNC" + rs.getString(1) + "\t") + "",
                    fw.append(rs.getString(1) + "\t") + "",
                    fw.append(rs.getString(2) + "\t") + "",
                    fw.append(rs.getString(3) + "\t") + "",
                    fw.append("N/A" + "\t") + "",
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(5) + "\t") + "",
                    fw.append(rs.getString(6) + "\t") + "",
                    fw.append("true" + "\t") + "",
                    fw.append("5" + "\t") + "",
                    fw.append(rs.getString(6) + "/1" + "\t") + "",
                    fw.append(CheckAntenna.checkAntennaName(rs.getString(7)) + "\t") + "",
                    fw.append("\t") + "",
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(5) + "\t") + "",
                    fw.append(rs.getString(8) + "\t") + "",
                    fw.append(rs.getString(9) + "\t") + "",
                    fw.append(rs.getString(10) + "\t") + "",
                    fw.append("3" + "\t") + "",
                    fw.append("3" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("\t") + "",
                    fw.append("false" + "\n") + "");

        }
        fw.flush();
        fw.close();

        System.out.println("Antenna.txt file is done.");
    }


}

