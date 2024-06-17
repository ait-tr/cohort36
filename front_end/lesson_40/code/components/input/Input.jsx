function Input({ placeholder, type, label }) {
  return (
    <div>
      <label htmlFor="">{label}: </label>
      <input type={type} placeholder={placeholder} />
    </div>
  );
}

export default Input;
