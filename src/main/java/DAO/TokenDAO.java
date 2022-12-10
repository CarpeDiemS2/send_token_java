package DAO;

import model.Token;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TokenDAO {
    private Connection connection;


    public TokenDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Token> listar(){
        List<Token> listaToken = new ArrayList<>();
        String sql = "SELECT * FROM tbtoken";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Token token = new Token(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getInt(3)
                    );
                    listaToken.add(token);
                }
                return listaToken;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
