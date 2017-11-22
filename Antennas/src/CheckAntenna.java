import java.util.HashMap;
import java.util.Map;

public class CheckAntenna {

    public static String checkAntennaName(String antennaName) {

        String result = "";

        Map<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("Omni", "OMNI");

        hashMap.put("HB02-6516DS-VTM_2100", "HB02-6516DS-VTM_2100");

        hashMap.put("KT_739489_2100_0", "KT_739489");

        hashMap.put("KT_741571_2100_0", "KT_741571");

        hashMap.put("ODP-065R12J03_2100", "ODP-065R12J03_2100");



        hashMap.put("742215_2100_00T", "742215_2100"); hashMap.put("742236_2100_00T", "742236_2100"); hashMap.put("742213_2100_00T", "742213_2100");
        hashMap.put("742215_2100_01T", "742215_2100"); hashMap.put("742236_2100_01T", "742236_2100"); hashMap.put("742213_2100_01T", "742213_2100");
        hashMap.put("742215_2100_02T", "742215_2100"); hashMap.put("742236_2100_02T", "742236_2100"); hashMap.put("742213_2100_02T", "742213_2100");
        hashMap.put("742215_2100_03T", "742215_2100"); hashMap.put("742236_2100_03T", "742236_2100"); hashMap.put("742213_2100_03T", "742213_2100");
        hashMap.put("742215_2100_04T", "742215_2100"); hashMap.put("742236_2100_04T", "742236_2100"); hashMap.put("742213_2100_04T", "742213_2100");
        hashMap.put("742215_2100_05T", "742215_2100"); hashMap.put("742236_2100_05T", "742236_2100"); hashMap.put("742213_2100_05T", "742213_2100");
        hashMap.put("742215_2100_06T", "742215_2100"); hashMap.put("742236_2100_06T", "742236_2100"); hashMap.put("742213_2100_06T", "742213_2100");
        hashMap.put("742215_2100_07T", "742215_2100"); hashMap.put("742236_2100_07T", "742236_2100"); hashMap.put("742213_2100_07T", "742213_2100");
        hashMap.put("742215_2100_08T", "742215_2100"); hashMap.put("742236_2100_08T", "742236_2100"); hashMap.put("742213_2100_08T", "742213_2100");
        hashMap.put("742215_2100_09T", "742215_2100"); hashMap.put("742236_2100_09T", "742236_2100"); hashMap.put("742213_2100_09T", "742213_2100");
        hashMap.put("742215_2100_10T", "742215_2100"); hashMap.put("742236_2100_10T", "742236_2100"); hashMap.put("742213_2100_10T", "742213_2100");

        hashMap.put("APXV18-276516-C_2100_00T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_00T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_00T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_01T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_01T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_01T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_02T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_02T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_02T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_03T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_03T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_03T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_04T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_04T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_04T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_05T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_05T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_05T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_06T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_06T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_06T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_07T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_07T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_07T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_08T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_08T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_08T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_09T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_09T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_09T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_10T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_10T", "APXVLL13-C_2100"); hashMap.put("APXVRR20-C_2100_10T", "APXVRR20-C_2100");
        hashMap.put("APXV18-276516-C_2100_11T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_11T", "APXVLL13-C_2100");
        hashMap.put("APXV18-276516-C_2100_12T", "APXV18-276516-C_2100"); hashMap.put("APXVLL13-C_2100_12T", "APXVLL13-C_2100");

        hashMap.put("INT_1900-18_65_2100_00T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_00T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_00T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_00T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_00T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_00T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_01T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_01T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_01T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_01T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_01T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_01T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_02T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_02T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_02T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_02T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_02T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_02T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_03T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_03T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_03T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_03T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_03T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_03T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_04T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_04T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_04T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_04T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_04T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_04T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_05T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_05T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_05T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_05T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_05T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_05T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_06T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_06T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_06T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_06T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_06T","INT-1900-1900-20-20-65_2100"); hashMap.put("IN_INT-1900-19-5-65-0-6_06T","IN_INT-1900-19-5-65-0-6");
        hashMap.put("INT_1900-18_65_2100_07T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_07T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_07T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_07T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_07T","INT-1900-1900-20-20-65_2100");
        hashMap.put("INT_1900-18_65_2100_08T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_08T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_08T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_08T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_08T","INT-1900-1900-20-20-65_2100");
        hashMap.put("INT_1900-18_65_2100_09T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_09T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_09T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_09T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_09T","INT-1900-1900-20-20-65_2100");
        hashMap.put("INT_1900-18_65_2100_10T", "INT_1900-18_65_2100"); hashMap.put("INT_2250-19_65_2100_10T", "INT_2250-19_65_2100"); hashMap.put("INT-800-1900-1900_2100_10T","INT-800-1900-1900_2100"); hashMap.put("INT-2250-2250-19-19-65_2100_10T","INT-2250-2250-19-19-65_2100"); hashMap.put("INT-1900-1900-20-20-65_2100_10T","INT-1900-1900-20-20-65_2100");


        hashMap.put("ODV-065R17E18K18K_2100_00T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_00T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_00T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_00T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_00T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_00T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_00T", "ODV-065R17B17K17K(V)_2100");;
        hashMap.put("ODV-065R17E18K18K_2100_01T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_01T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_01T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_01T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_01T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_01T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_01T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_02T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_02T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_02T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_02T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_02T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_02T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_02T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_03T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_03T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_03T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_03T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_03T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_03T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_03T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_04T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_04T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_04T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_04T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_04T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_04T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_04T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_05T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_05T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_05T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_05T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_05T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_05T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_05T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_06T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_06T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_06T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_06T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_06T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_06T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_06T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_07T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_07T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_07T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_07T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_07T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_07T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_07T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_08T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_08T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_08T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_08T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_08T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_08T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_08T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_09T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_09T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_09T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_09T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_09T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_09T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_09T", "ODV-065R17B17K17K(V)_2100");
        hashMap.put("ODV-065R17E18K18K_2100_10T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_10T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_10T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_10T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_10T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_10T", "ODV-065R18K18K-G_2100");

        hashMap.put("ODV2-065R16J-G_2100_00T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_00T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_00T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_01T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_01T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_01T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_02T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_02T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_02T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_03T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_03T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_03T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_04T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_04T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_04T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_05T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_05T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_05T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_06T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_06T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_06T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_07T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_07T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_07T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_08T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_08T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_08T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_09T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_09T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_09T", "ODV3-065R18J-G_V1_2100");
        hashMap.put("ODV2-065R16J-G_2100_10T", "ODV2-065R16J-G_2100"); hashMap.put("ODV2-065R18K-G_V1_2100_10T", "ODV2-065R18K-G_V1_2100"); hashMap.put("ODV3-065R18J-G_V1_2100_10T", "ODV3-065R18J-G_V1_2100");

        hashMap.put("TDQH-182018DE-65F_2100_00T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_01T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_02T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_03T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_04T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_05T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_06T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_07T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_08T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_09T", "TDQH-182018DE-65F_2100");
        hashMap.put("TDQH-182018DE-65F_2100_10T", "TDQH-182018DE-65F_2100");

        hashMap.put("ADFDP182-6565B-XDM_2100_00T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_01T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_02T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_03T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_04T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_05T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_06T", "ADFDP182-6565B-XDM_2100");
        hashMap.put("ADFDP182-6565B-XDM_2100_07T", "ADFDP182-6565B-XDM_2100");

        hashMap.put("MJS-ODV065R18J_2100_00T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_01T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_02T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_03T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_04T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_05T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_06T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_07T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_08T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_09T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_10T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_11T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_12T", "MJS-ODV065R18J_2100");
        hashMap.put("MJS-ODV065R18J_2100_13T", "MJS-ODV065R18J_2100");

        hashMap.put("ODP-065R18KV18KV_2100_00T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_01T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_02T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_03T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_04T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_05T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_06T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_07T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_2100_08T", "ODP-065R18KV18KV_2100");

        hashMap.put("TDJH-182018DE-65F_2100_00T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_01T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_02T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_03T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_04T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_05T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_06T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_07T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_08T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_09T", "TDJH-182018DE-65F_2100");
        hashMap.put("TDJH-182018DE-65F_2100_10T", "TDJH-182018DE-65F_2100");

        hashMap.put("AMB4520R0_2100_m30_00T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_00T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_01T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_01T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_02T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_02T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_03T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_03T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_04T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_04T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_05T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_05T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_06T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_06T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_07T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_07T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_08T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_08T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_09T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_09T", "AMB4520R0_2100_p30");
        hashMap.put("AMB4520R0_2100_m30_10T", "AMB4520R0_2100_m30"); hashMap.put("AMB4520R0_2100_p30_10T", "AMB4520R0_2100_p30");

        hashMap.put("ODV-065R15K-G_2100_00T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_01T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_02T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_03T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_04T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_05T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_06T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_07T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_08T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_09T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_10T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_11T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_12T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_13T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_14T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_15T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_16T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_17T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_18T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_19T", "ODV-065R15K-G_2100");
        hashMap.put("ODV-065R15K-G_2100_20T", "ODV-065R15K-G_2100");


        for (String key : hashMap.keySet()) {

            if (key.equals(antennaName)) {

                result = hashMap.get(key) + "/" + key;
                return result;

            } else if (!key.equals(antennaName)) {

                result = "Antennas/" + antennaName;

            }

        }

        return result;
    }

    public static String checkAntennaId(String nameForDefiningAntenna) {


        return null;
    }
}
