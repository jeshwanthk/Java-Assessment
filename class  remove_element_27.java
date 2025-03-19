class  remove_element_27{
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer for placing non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // Keep only non-val elements
                nums[index] = nums[i];
                index++; // Move pointer forward
            }
        }
        
        return index; // New length of array
    }
}
