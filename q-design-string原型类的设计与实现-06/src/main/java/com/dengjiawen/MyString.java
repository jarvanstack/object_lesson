package com.dengjiawen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * imitate the String class .
 */
public class MyString {
    /**
     * this  value is used fo character storage
     */
    private final char value[];

    public MyString(String value) {
        this.value = value.toCharArray();
    }

    //3.1.1 ignored case
    public MyString(char[] valueChars) {
        this.value = valueChars;
    }

    public MyString(List<Character> characterList) {
        char[] chars = new char[characterList.size()];
        for (int i = 0; i < characterList.size(); i++) {
            chars[i] = characterList.get(i);
        }
        this.value = chars;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < value.length; i++) {
            s += value[i];
        }
        return s;
    }

    /**
     * compare a string with a object ,and do not ignored the case
     *
     * @param anObject
     * @return
     */
    public boolean compare(Object anObject) {
        //if address is same ,return true
        if (this.value == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String) anObject;
            int n = value.length;
            if (n == anotherString.length()) {
                char v1[] = this.value;
                char v2[] = anotherString.toCharArray();
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * compare the string ,and the anObject ,
     *
     * @param anObject    other object
     * @param ignoredCase true means you ignored the upper case and  the lowercase and compared them .
     * @return whether this equals other object
     */
    public boolean compare(Object anObject, boolean ignoredCase) {
        //if ignored case just use the method  compare(Object anObject)
        if (ignoredCase) {
            return compare(anObject);
        }
        //if you need ignored the case ,let the anObject to uppercase and compare them
        String anObject1 = (String) anObject;
        return new MyString(value.toString().toUpperCase()).compare(anObject1.toUpperCase());
    }

    /**
     * calculate the length of the string .
     *
     * @return length of the string.
     */
    public int length() {
        //let the string to a char array ,and use the field of array [length]
        return value.length;
    }

    /**
     * append the string ,behind this string.
     *
     * @param appendString string was append
     * @return a new ,and more long string.
     */
    public MyString append(String appendString) {

        return new MyString(this.value.toString() + appendString);
    }

    public MyString replace(char oldChar, char newChar) {
        //make sure they are different.
        char[] chars = null;
        if (oldChar != newChar) {
            int length = value.length;
            chars = this.value;
            //loop it ,and replace the oldChar .
            for (int i = 0; i < length; i++) {
                if (chars[i] == oldChar) {
                    chars[i] = newChar;
                }
            }
        }
        //change chars array to string .just simple loop,and +=.
        String newValue = "";
        for (char aChar : chars) {
            newValue += aChar;
        }
        return new MyString(newValue);
    }

    /**
     * if this.value contains the [string]
     *
     * @param string string
     * @return whether the this.value contains param string
     */
    public boolean contains(String string) {
        char[] chars = string.toCharArray();
        int j = 0;
        for (int i = 0; i < value.length; i++) {
            if (chars[j] == value[i]) {
                j++;
            }
            if (j == chars.length) {
                return true;
            }
        }
        return false;
    }

    /**
     * return integer[] of the index that string,start index.
     *
     * @param string     string
     * @param startIndex index start loop value
     * @param endIndex   end index
     * @return return integer[] of the index that string,start index.
     */
    public Integer[] findIndex(String string, int startIndex, int endIndex) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        char[] chars = string.toCharArray();
        int j = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (chars[j] == value[i]) {
                j++;
            }
            if (j >= chars.length) {
                arrayList.add(i - j);
                //这里不处理将会 chars的指针溢出，因为这里之前会 return，
                //现在没有return了，就会炸裂，我们应该，这里重置 j chars 的 index
                j = 0;
            }
        }
        return arrayList.toArray(new Integer[arrayList.size()]);
    }

    /**
     * findIndex , end index default is value's length,all value will be scan
     *
     * @param string     string
     * @param startIndex start index
     * @return return integer[] of the index that string,start index.
     */
    public Integer[] findIndex(String string, int startIndex) {
        int endIndex = string.length();
        return findIndex(string, startIndex, endIndex);
    }

    /**
     * findIndex , end index default is value's length,all value will be scan
     * start index default is 0.
     *
     * @param string string
     * @return return integer[] of the index that string,start index.
     */
    public Integer[] findIndex(String string) {
        int endIndex = string.length();
        int startIndex = 0;
        return findIndex(string, startIndex, endIndex);
    }

    public MyString trimLeadingAndTrailing() {
        int lengthOfValue = value.length;
        int startIndex = 0;
        //reduce the range if left have whitespace
        while ((startIndex < lengthOfValue) && (value[startIndex] <= ' ')) {
            startIndex++;
        }
        //reduce the range if right have whitespace
        while ((startIndex < lengthOfValue) && (value[lengthOfValue - 1] <= ' ')) {
            lengthOfValue--;
        }
        //now we get the range of the value that have not any whitespace at leading or trailing.
        //we just need to get it ,we use a method subString() at to trim the value.
        //we use a Ternary Operation Symbol, and make sure meet the criteria.
        return ((startIndex > 0 )||(lengthOfValue < value.length) ? subString(startIndex,lengthOfValue) : this);
    }

    /**
     * subString
     * @param beginIndex beginIndex
     * @param endIndex endIndex
     * @return new MyString that be cut.
     */
    public MyString subString(int beginIndex,int endIndex){
        //make sure no error.
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        //use Arrays.copyOfRange() to cut the string.
        return ((beginIndex == 0) && (endIndex == value.length)) ? this
                : new MyString(Arrays.copyOfRange(value, beginIndex, endIndex));
    }

    /**
     * trim all the whitespace.
     *
     * @return MyString that been trim all whitespace
     */
    public MyString trimAll() {
        ArrayList characters = new ArrayList<Character>();
        for (int i = 0; i < this.value.length; i++) {
            characters.add(this.value[i]);
        }
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i).equals(' ')) {
                characters.remove(i);
            }
        }
        return new MyString(characters);
    }

    /**
     * remove the same words that near each other.
     * this need to update
     *
     * @return
     */
    public MyString removeSameAndNear() {
        ArrayList characters = new ArrayList<Character>();
        for (int i = 0; i < this.value.length; i++) {
            characters.add(this.value[i]);
        }

        for (int i = 0; i < (characters.size() - 1); i++) {
            if (characters.get(i + 1).equals(characters.get(i))) {
                Object o = characters.get(i);
            }
        }
        return new MyString(characters);
    }

    /**
     * only replace the first string with [newString]
     *
     * @param oldString
     * @param newString
     * @return
     */
    public MyString replaceFirst(String oldString, String newString) {
        String replace = this.toString().replace(oldString, newString);
        return new MyString(replace);
    }

    /**
     * insert a word at index [insertIndex]
     *
     * @param insertString
     * @param insertIndex
     * @return
     */
    public MyString insert(String insertString, int insertIndex) {

        StringBuilder sb = new StringBuilder(this.toString());
        sb.insert(insertIndex, insertString);
        return new MyString(sb.toString());
    }

    /**
     * remove a word from start index to end index.
     * @param startRemoveIndex
     * @param endRemoveIndex
     * @return
     */
    public MyString removeAtIndex(int startRemoveIndex, int endRemoveIndex) {
        char[] chars = this.value;
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        for (int i = startRemoveIndex; i < endRemoveIndex; i++) {
            characters.remove(i);
        }
        return new MyString(characters);
    }


}
