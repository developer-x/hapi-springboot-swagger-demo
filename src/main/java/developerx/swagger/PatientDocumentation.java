package developerx.swagger;

public class PatientDocumentation {

    public static final String DESCRIPTION =
            "Demographics and other administrative information about an individual or " +
                    "animal receiving care or other health-related services.";

    public static final String EXAMPLE = "{\n" +
            "  \"resourceType\" : \"Patient\",\n" +
            "  \"id\" : \"example\",\n" +
            "  \"identifier\" : [{\n" +
            "    \"use\" : \"usual\",\n" +
            "    \"type\" : {\n" +
            "      \"coding\" : [{\n" +
            "        \"system\" : \"http://terminology.hl7.org/CodeSystem/v2-0203\",\n" +
            "        \"code\" : \"MR\"\n" +
            "      }]\n" +
            "    },\n" +
            "    \"system\" : \"urn:oid:1.2.36.146.595.217.0.1\",\n" +
            "    \"value\" : \"12345\",\n" +
            "    \"period\" : {\n" +
            "      \"start\" : \"2001-05-06\"\n" +
            "    },\n" +
            "    \"assigner\" : {\n" +
            "      \"display\" : \"Acme Healthcare\"\n" +
            "    }\n" +
            "  }],\n" +
            "  \"active\" : true,\n" +
            "  \"name\" : [{\n" +
            "    \"use\" : \"official\",\n" +
            "    \"family\" : \"Chalmers\",\n" +
            "    \"given\" : [\"Peter\",\n" +
            "    \"James\"]\n" +
            "  },\n" +
            "  {\n" +
            "    \"use\" : \"usual\",\n" +
            "    \"given\" : [\"Jim\"]\n" +
            "  },\n" +
            "  {\n" +
            "    \"use\" : \"maiden\",\n" +
            "    \"family\" : \"Windsor\",\n" +
            "    \"given\" : [\"Peter\",\n" +
            "    \"James\"],\n" +
            "    \"period\" : {\n" +
            "      \"end\" : \"2002\"\n" +
            "    }\n" +
            "  }],\n" +
            "  \"telecom\" : [{\n" +
            "    \"use\" : \"home\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"system\" : \"phone\",\n" +
            "    \"value\" : \"(03) 5555 6473\",\n" +
            "    \"use\" : \"work\",\n" +
            "    \"rank\" : 1\n" +
            "  },\n" +
            "  {\n" +
            "    \"system\" : \"phone\",\n" +
            "    \"value\" : \"(03) 3410 5613\",\n" +
            "    \"use\" : \"mobile\",\n" +
            "    \"rank\" : 2\n" +
            "  },\n" +
            "  {\n" +
            "    \"system\" : \"phone\",\n" +
            "    \"value\" : \"(03) 5555 8834\",\n" +
            "    \"use\" : \"old\",\n" +
            "    \"period\" : {\n" +
            "      \"end\" : \"2014\"\n" +
            "    }\n" +
            "  }],\n" +
            "  \"gender\" : \"male\",\n" +
            "  \"birthDate\" : \"1974-12-25\",\n" +
            "  \"_birthDate\" : {\n" +
            "    \"extension\" : [{\n" +
            "      \"url\" : \"http://hl7.org/fhir/StructureDefinition/patient-birthTime\",\n" +
            "      \"valueDateTime\" : \"1974-12-25T14:35:45-05:00\"\n" +
            "    }]\n" +
            "  },\n" +
            "  \"deceasedBoolean\" : false,\n" +
            "  \"address\" : [{\n" +
            "    \"use\" : \"home\",\n" +
            "    \"type\" : \"both\",\n" +
            "    \"text\" : \"534 Erewhon St PeasantVille, Rainbow, Vic  3999\",\n" +
            "    \"line\" : [\"534 Erewhon St\"],\n" +
            "    \"city\" : \"PleasantVille\",\n" +
            "    \"district\" : \"Rainbow\",\n" +
            "    \"state\" : \"Vic\",\n" +
            "    \"postalCode\" : \"3999\",\n" +
            "    \"period\" : {\n" +
            "      \"start\" : \"1974-12-25\"\n" +
            "    }\n" +
            "  }],\n" +
            "  \"contact\" : [{\n" +
            "    \"relationship\" : [{\n" +
            "      \"coding\" : [{\n" +
            "        \"system\" : \"http://terminology.hl7.org/CodeSystem/v2-0131\",\n" +
            "        \"code\" : \"N\"\n" +
            "      }]\n" +
            "    }],\n" +
            "    \"name\" : {\n" +
            "      \"family\" : \"du Marché\",\n" +
            "      \"_family\" : {\n" +
            "        \"extension\" : [{\n" +
            "          \"url\" : \"http://hl7.org/fhir/StructureDefinition/humanname-own-prefix\",\n" +
            "          \"valueString\" : \"VV\"\n" +
            "        }]\n" +
            "      },\n" +
            "      \"given\" : [\"Bénédicte\"]\n" +
            "    },\n" +
            "    \"telecom\" : [{\n" +
            "      \"system\" : \"phone\",\n" +
            "      \"value\" : \"+33 (237) 998327\"\n" +
            "    }],\n" +
            "    \"address\" : {\n" +
            "      \"use\" : \"home\",\n" +
            "      \"type\" : \"both\",\n" +
            "      \"line\" : [\"534 Erewhon St\"],\n" +
            "      \"city\" : \"PleasantVille\",\n" +
            "      \"district\" : \"Rainbow\",\n" +
            "      \"state\" : \"Vic\",\n" +
            "      \"postalCode\" : \"3999\",\n" +
            "      \"period\" : {\n" +
            "        \"start\" : \"1974-12-25\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"gender\" : \"female\",\n" +
            "    \"period\" : {\n" +
            "      \"start\" : \"2012\"\n" +
            "    }\n" +
            "  }],\n" +
            "  \"managingOrganization\" : {\n" +
            "    \"reference\" : \"Organization/1\"\n" +
            "  }\n" +
            "}";
}
