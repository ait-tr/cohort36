import styled from '@emotion/styled';

interface ButtonProps {
  primary?: boolean;
}

export const StyledButton = styled.button<ButtonProps>`
  border: none;
  align-self: center;
  border-radius: 3px;
  background-color: ${(props) => props.primary ? '#ab25ff' : '#ff9925'}  ;
  padding: 3px;
  cursor: pointer;
  margin: 2px;
  :hover {
    background-color: #6363f8;
  }
`;


export default function ButtonStyledComponent() {
  return (
    <StyledButton primary={true} >button</StyledButton>
  );
}
