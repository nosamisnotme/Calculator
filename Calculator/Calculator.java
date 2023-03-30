package Calculator;
public class Calculator {
    public String calc(String equ, int left, int right){
        System.out.println(equ.substring(left, right));
        if (equ.substring(left, right).contains("(")){
            while (!(equ.substring(left, left+1).equals("("))){
                left++;
            }
            left++;
            while (!(equ.substring(right-1, right).equals(")"))){
                right--;
            }
            right--;
            equ.replace(equ.substring(left-1, right+1), calc(equ, left, right));
            System.out.println(equ);

        }
        else if (equ.substring(left, right).contains("^")||equ.substring(left, right).contains("*")||equ.substring(left, right).contains("/")||equ.substring(left, right).contains("+")||equ.substring(left, right).contains("-")){
            int symTrack = 0;
            if (equ.substring(left, right).contains("^")){
                while (!(equ.substring(symTrack, symTrack+1).equals("^"))){
                    symTrack++;
                }
                return Integer.toString((int)Math.pow(Integer.parseInt(equ.substring(left, symTrack)), Integer.parseInt(equ.substring(symTrack+1, right))));
            }
            if (equ.substring(left, right).contains("*")){
                while (!(equ.substring(symTrack, symTrack+1).equals("*"))){
                    symTrack++;
                }
                return Integer.toString((int)(Integer.parseInt(equ.substring(left, symTrack))*Integer.parseInt(equ.substring(symTrack+1, right))));
            }
            if (equ.substring(left, right).contains("/")){
                while (!(equ.substring(symTrack, symTrack+1).equals("/"))){
                    symTrack++;
                }
                return Integer.toString((int)(Integer.parseInt(equ.substring(left, symTrack))/Integer.parseInt(equ.substring(symTrack+1, right))));
            }
            if (equ.substring(left, right).contains("+")){
                while (!(equ.substring(symTrack, symTrack+1).equals("+"))){
                    symTrack++;
                }
                return Integer.toString((int)(Integer.parseInt(equ.substring(left, symTrack))+Integer.parseInt(equ.substring(symTrack+1, right))));
            }
            if (equ.substring(left, right).contains("-")){
                while (!(equ.substring(symTrack, symTrack+1).equals("-"))){
                    symTrack++;
                }
                return Integer.toString((int)(Integer.parseInt(equ.substring(left, symTrack))-Integer.parseInt(equ.substring(symTrack+1, right))));
            }
        }
        return equ;
        
    }
}
