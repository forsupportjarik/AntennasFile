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

        hashMap.put("INT_1900-18_65_2100_00T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_01T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_02T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_03T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_04T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_05T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_06T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_07T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_08T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_09T", "INT_1900-18_65_2100");
        hashMap.put("INT_1900-18_65_2100_10T", "INT_1900-18_65_2100");

        hashMap.put("ODV-065R17E18K18K_2100_00T", "ODV-065R17E18K18K_2100"); hashMap.put("ODV-065R18K-G_2100_00T", "ODV-065R18K-G_2100"); hashMap.put("ODV-032R21K-G_2100_00T", "ODV-032R21K-G_2100"); hashMap.put("ODV-065R15K15K_2100_00T", "ODV-065R15K15K_2100"); hashMap.put("ODV-065R17EKK-G_2100_00T", "ODV-065R17EKK-G_2100"); hashMap.put("ODV-065R18K18K-G_2100_00T", "ODV-065R18K18K-G_2100"); hashMap.put("ODV-065R17B17K17K(V)_2100_00T", "ODV-065R17B17K17K(V)_2100");
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

        hashMap.put("ODP-065R18KV18KV_210_00T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_01T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_02T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_03T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_04T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_05T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_06T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_07T", "ODP-065R18KV18KV_2100");
        hashMap.put("ODP-065R18KV18KV_210_08T", "ODP-065R18KV18KV_2100");

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
}
