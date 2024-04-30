package codegeneration;

public class ExecuteCGDTO {
    int bytesReturn;
    int bytesLocals;
    int bytesArgs;

    public ExecuteCGDTO(int bytesReturn, int bytesLocals, int bytesArgs){
        this.bytesReturn = bytesReturn;
        this.bytesLocals = bytesLocals;
        this.bytesArgs = bytesArgs;
    }
}
