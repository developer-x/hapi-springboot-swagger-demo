package developerx.swagger;

public class ConditionDocumentation {

    public static final String DESCRIPTION =
            "A clinical condition, problem, diagnosis, or other event, situation, issue, or " +
                    "clinical concept that has risen to a level of concern.";

    public static final String EXAMPLE = "{\n" +
            "  \"resourceType\" : \"Condition\",\n" +
            "  \"id\" : \"example\",\n" +
            "  \"text\" : {\n" +
            "    \"status\" : \"generated\",\n" +
            "    \"div\" : \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">Severe burn of left ear (Date: 24-May 2012)</div>\"\n" +
            "  },\n" +
            "  \"clinicalStatus\" : {\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://terminology.hl7.org/CodeSystem/condition-clinical\",\n" +
            "      \"code\" : \"active\"\n" +
            "    }]\n" +
            "  },\n" +
            "  \"verificationStatus\" : {\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://terminology.hl7.org/CodeSystem/condition-ver-status\",\n" +
            "      \"code\" : \"confirmed\"\n" +
            "    }]\n" +
            "  },\n" +
            "  \"category\" : [{\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://terminology.hl7.org/CodeSystem/condition-category\",\n" +
            "      \"code\" : \"encounter-diagnosis\",\n" +
            "      \"display\" : \"Encounter Diagnosis\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"system\" : \"http://snomed.info/sct\",\n" +
            "      \"code\" : \"439401001\",\n" +
            "      \"display\" : \"Diagnosis\"\n" +
            "    }]\n" +
            "  }],\n" +
            "  \"severity\" : {\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://snomed.info/sct\",\n" +
            "      \"code\" : \"24484000\",\n" +
            "      \"display\" : \"Severe\"\n" +
            "    }]\n" +
            "  },\n" +
            "  \"code\" : {\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://snomed.info/sct\",\n" +
            "      \"code\" : \"39065001\",\n" +
            "      \"display\" : \"Burn of ear\"\n" +
            "    }],\n" +
            "    \"text\" : \"Burnt Ear\"\n" +
            "  },\n" +
            "  \"bodySite\" : [{\n" +
            "    \"coding\" : [{\n" +
            "      \"system\" : \"http://snomed.info/sct\",\n" +
            "      \"code\" : \"49521004\",\n" +
            "      \"display\" : \"Left external ear structure\"\n" +
            "    }],\n" +
            "    \"text\" : \"Left Ear\"\n" +
            "  }],\n" +
            "  \"subject\" : {\n" +
            "    \"reference\" : \"Patient/example\"\n" +
            "  },\n" +
            "  \"onsetDateTime\" : \"2012-05-24\"\n" +
            "}";
}
