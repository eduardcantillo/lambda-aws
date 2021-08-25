package com.pragma.practica.aws;

        import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
        import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
        import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
        import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
        import com.amazonaws.services.dynamodbv2.model.AttributeValue;
        import com.amazonaws.services.lambda.runtime.Context;
        import com.amazonaws.services.lambda.runtime.RequestHandler;
        import models.Clientes;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;


public class Handler implements RequestHandler<Clientes,Object> {
    @Override
    public Object handleRequest(Clientes clientes, Context context) {
        AmazonDynamoDB db= AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper=new DynamoDBMapper(db);

        if(clientes.getEdad()==null || clientes.getEdad()<=0){

            return new ArrayList<>();
        }

        Map<String, AttributeValue> eav = new HashMap<>();
        eav.put(":val1", new AttributeValue().withN(""+clientes.getEdad()));

        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression()
                .withFilterExpression("edad >= :val1").withExpressionAttributeValues(eav);

        List<Clientes> scanResult = mapper.scan(Clientes.class, scanExpression);
            return scanResult;
        }

    }

